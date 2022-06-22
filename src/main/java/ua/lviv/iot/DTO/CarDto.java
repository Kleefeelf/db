package ua.lviv.iot.DTO;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class CarDto {
    private Integer idCar;
    private String category;
    private String number;
    private String name;
    private Boolean availability;
}
