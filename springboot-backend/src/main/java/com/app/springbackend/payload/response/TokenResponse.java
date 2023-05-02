package com.app.springbackend.payload.response;

import lombok.*;

import java.util.List;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TokenResponse {

    private Long id;

    private String username, userEmail;

    private List<String> roles;

    private String token, type;
}
