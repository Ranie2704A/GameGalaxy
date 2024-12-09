package com.grupo8.ggbackend.order.infrastructure.secondary.service.kinde;

import com.fasterxml.jackson.annotation.JsonProperty;

public record KindeAccessToken(@JsonProperty String accessToken, @JsonProperty String tokenType) {

}
