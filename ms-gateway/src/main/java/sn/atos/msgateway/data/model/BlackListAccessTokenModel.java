package sn.atos.msgateway.data.model;

import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "blackListAccessTokens")
public class BlackListAccessTokenModel {

  @Id
  private String id;

  @Field(value = "accessToken")
  private String accessToken;

  @Field(value = "expiryDate")
  private LocalDateTime expiryDate;

  public BlackListAccessTokenModel(String accessToken) {
    this.accessToken = accessToken;
    this.expiryDate = LocalDateTime.now().plusHours(2).withMinute(0).withSecond(0);
  }

  public String getId() {
    return this.id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getAccessToken() {
    return this.accessToken;
  }

  public void setAccessToken(String accessToken) {
    this.accessToken = accessToken;
  }

  public LocalDateTime getExpiryDate() {
    return this.expiryDate;
  }

  public void setExpiryDate(LocalDateTime expiryDate) {
    this.expiryDate = expiryDate;
  }

}
