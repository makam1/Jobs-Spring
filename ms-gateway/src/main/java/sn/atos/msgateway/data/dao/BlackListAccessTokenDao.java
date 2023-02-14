package sn.atos.msgateway.data.dao;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import sn.atos.msgateway.data.model.BlackListAccessTokenModel;

@Repository
public interface BlackListAccessTokenDao extends MongoRepository<BlackListAccessTokenModel, String> {
  Optional<BlackListAccessTokenModel> findByAccessToken(String accessToken);

  boolean existsByAccessToken(String accessToken);

  Optional<BlackListAccessTokenModel> deleteByAccessToken(String accessToken);

  List <BlackListAccessTokenModel> deleteByExpiryDateGreaterThan(LocalDateTime date);
}