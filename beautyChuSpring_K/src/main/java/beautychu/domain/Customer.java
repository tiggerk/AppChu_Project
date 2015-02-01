package beautychu.domain;

import java.io.Serializable;

public class Customer implements Serializable {

  private static final long serialVersionUID = 1L;
  String email;
  String couponCode;
  String profilePhoto;
  
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }
  public String getCouponCode() {
    return couponCode;
  }
  public void setCouponCode(String couponCode) {
    this.couponCode = couponCode;
  }
  public String getProfilePhoto() {
    return profilePhoto;
  }
  public void setProfilePhoto(String profilePhoto) {
    this.profilePhoto = profilePhoto;
  }
  
  @Override
  public String toString() {
    return "Customer [email=" + email + ", couponCode=" + couponCode
        + ", profilePhoto=" + profilePhoto + "]";
  }
  
  
}
