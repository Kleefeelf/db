package iot.models;

import lombok.*;
import javax.persistence.*;
import java.util.List;

@Entity
@Table(name= "cost")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Cost {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_cost")
    private Integer idCost;

    @Column(name="order_cost", nullable = false)
    private Integer orderCost;

    @Column(name="order_currency", length = 20, nullable = false)
    private String orderCurrency;

    @OneToMany(fetch = FetchType.LAZY)
    private List<Cost> costs;

    public Cost(Integer idCost, Integer orderCost, String orderCurrency) {
        this.idCost = idCost;
        this.orderCost = orderCost;
        this.orderCurrency = orderCurrency;
    }

    @Override
    public String toString() {
        return "Cost {"
                + "id =" + idCost + ", "
                + "orderCost =" + orderCost + ", "
                + "orderCurrency = " + orderCurrency + ", "
                + "};" + "\n";
    }
}
