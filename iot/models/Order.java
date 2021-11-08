package iot.models;

import java.util.List;
import lombok.*;
import javax.persistence.*;


@Entity
@Table(name= "uklon.order")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_order")
    private Integer idOrder;

    @Column(name = "user_userID", nullable = false)
    private Integer userUserID;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cost_id_cost", nullable = false)
    private Cost cost;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_user_id", nullable = false)
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "driver_id_driver", nullable = false)
    private Driver driver;

    @Override
    public String toString() {
        return "Order {"
                + "id =" + idOrder + ", "
                + "userUserID =" + userUserID + ", "
                + "costIdCost = " + cost + ", "
                + "userUserId = " + user + ", "
                + "driverIdDriver = " + driver + ", "
                + "};" + "\n";
    }
}
