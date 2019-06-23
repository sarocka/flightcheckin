package checkIn.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import checkIn.dto.Reservation;
import checkIn.dto.ReservationUpdateRequest;
import checkIn.integration.ReservationRestClient;





@Controller
public class CheckInController {

	@Autowired
	private ReservationRestClient restClient;
	
	
	
	
	@RequestMapping("showStartCheckIn")
	public String showStartCheckIn() {
		
		return "startCheckIn";
	}
	@RequestMapping("startCheckIn")
	public String startCheckIn(@RequestParam("reservationId")Long reservationId, ModelMap modelMap) {
		Reservation reservation = restClient.findreservation(reservationId);
		modelMap.addAttribute("reservation", reservation);
		return "displayReservationDetails";
	}
	
	@RequestMapping("completeCheckIn")
	public String completeCheckIn(@RequestParam("reservationId")Long reservationId,@RequestParam("numberOfBags")int numberOfBags, ModelMap modelMap) {
		ReservationUpdateRequest request = new ReservationUpdateRequest();
		request.setId(reservationId);
		request.setCheckedIn(true);
		request.setNumberOfBags(numberOfBags);
		
		restClient.updateReservation(request);
		return "checkInConfirmation";
	}
}
