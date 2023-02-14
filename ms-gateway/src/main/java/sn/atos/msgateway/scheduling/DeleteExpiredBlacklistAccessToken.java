package sn.atos.msgateway.scheduling;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import sn.atos.msgateway.data.dao.BlackListAccessTokenDao;

@Component("deleteExpiredBlacklistAccessToken")
@PropertySource("classpath:scheduled.properties")
public class DeleteExpiredBlacklistAccessToken {

  @Autowired
  private BlackListAccessTokenDao blackListAccessTokenDao;

  @Scheduled(cron = "${cron.every-two-hours}")
  public void scheduleDeleteExpiredBlacklistedAccessTokenn() {
    LocalDateTime dateNow = LocalDateTime.now().withMinute(0).withSecond(0);
    blackListAccessTokenDao.deleteByExpiryDateGreaterThan(dateNow);
  }
}
