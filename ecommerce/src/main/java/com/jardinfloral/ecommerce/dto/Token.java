package com.jardinfloral.ecommerce.dto;

public class Token {
private final String accessToken;

public Token(String accessToken) {
	this.accessToken = accessToken;
}//Constructor

public String getAccessToken() {
	return accessToken;
}//getAccessToken

}//Class Token
