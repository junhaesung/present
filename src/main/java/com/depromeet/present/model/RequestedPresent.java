package com.depromeet.present.model;

import lombok.*;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class RequestedPresent {
    private String name;
    private String description;
    private String link;

    public Present toPresent() {
        return Present.builder()
                .name(name)
                .description(description)
                .link(link)
                .build();
    }
}
