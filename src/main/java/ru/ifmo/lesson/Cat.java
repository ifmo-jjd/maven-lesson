package ru.ifmo.lesson;

import lombok.*;

@Getter
@ToString(exclude = "name")
// @ToString(exclude = {"name", "age"})
@NoArgsConstructor
@RequiredArgsConstructor
public class Cat {
    @Setter
    @NonNull
    private String name;

    private String color;
    @Setter
    private int age;
}
