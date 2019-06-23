package checkIn.integration;

import checkIn.dto.Reservation;
import checkIn.dto.ReservationUpdateRequest;

public interface ReservationRestClient {

	public Reservation findreservation(Long id);
	public Reservation updateReservation(ReservationUpdateRequest request);
}
