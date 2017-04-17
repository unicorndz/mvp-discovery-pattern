package io.unicorn.qb.web.rest;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by Abderrazak BOUADMA
 *
 * @since 4/17/17.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ErrorVO {

    private String message;
    private String description;
    private String documentationUrl;
}
