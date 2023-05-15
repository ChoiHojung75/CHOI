package untitled.domain;

import java.util.*;
import lombok.Data;
import untitled.infra.AbstractEvent;

@Data
public class DeliveryReturned extends AbstractEvent {

    private Long id;
    private String userid;
    private Long orderid;
    private String productname;
    private Long productid;
    private Integer qty;
    private String status;
    private String courier;
}
