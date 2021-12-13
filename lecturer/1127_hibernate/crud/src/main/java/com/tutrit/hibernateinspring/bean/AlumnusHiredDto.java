package com.tutrit.hibernateinspring.bean;

import lombok.*;
import lombok.experimental.FieldDefaults;
import lombok.experimental.FieldNameConstants;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@FieldNameConstants
@EqualsAndHashCode
public class AlumnusHiredDto {
    String name;
    boolean hired;
}
