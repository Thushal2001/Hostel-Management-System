package lk.ijse.gdse66.hostel.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author : Kavithma Thushal
 * @project : Hostel-Management-System
 * @since : 4:12 PM - 8/26/2023
 **/
@NoArgsConstructor
@AllArgsConstructor
@Data
public class ReservationDTO {
    private String reserveId;
    private String studentId;
    private String roomId;
    private String date;
    private String status;
    private String roomQty;
}
