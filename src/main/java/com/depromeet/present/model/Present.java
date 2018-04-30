package com.depromeet.present.model;

import com.depromeet.present.entity.PresentEntity;
import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class Present {
    private String name;
    private String description;
    private String link;

    public PresentEntity toPresentEntity() {
        return PresentEntity.builder()
                .name(name)
                .description(description)
                .link(link)
                .build();
    }

}
