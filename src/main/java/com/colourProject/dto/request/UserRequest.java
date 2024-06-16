package com.colourProject.dto.request;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Getter
@Setter
@ToString
public class UserRequest {
    private String username;
    private String password;
    private String email;
}
