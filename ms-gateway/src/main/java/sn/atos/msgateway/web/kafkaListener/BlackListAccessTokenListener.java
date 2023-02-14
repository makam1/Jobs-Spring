package sn.atos.msgateway.web.kafkaListener;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;
import sn.atos.msgateway.data.dao.BlackListAccessTokenDao;
import sn.atos.msgateway.data.model.BlackListAccessTokenModel;

@Component
@PropertySource("classpath:kafka.properties")
public class BlackListAccessTokenListener {
  
  @Autowired
  private BlackListAccessTokenDao blackListAccessTokenDao;

  @Value(value = "${kafka.topics.blacklistAccesstoken.name}")
  private String blacklistAccesstokenName;

  @KafkaListener(topics = "${kafka.topics.blacklistAccesstoken.name}", containerFactory = "blackListAccessTokenKafkaListenerContainerFactory", autoStartup = "${kafka.enabled}")
  public void listenCreationPaiement(String accessToken) {
    if (!blackListAccessTokenDao.existsByAccessToken(accessToken)) {
      BlackListAccessTokenModel blackListAccessToken = new BlackListAccessTokenModel(accessToken);
      blackListAccessTokenDao.save(blackListAccessToken); 
    }
  }
}
