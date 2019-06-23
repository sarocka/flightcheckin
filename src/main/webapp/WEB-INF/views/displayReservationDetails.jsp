<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Reservation details</title>
</head>
<body>
<h2>Flight details</h2>
<pre>
Operating airlines: ${reservation.flight.operatingAirlines}
Flight No: ${reservation.flight.flightNo}
Departure city: ${reservation.flight.departureCity}
Arrival city: ${reservation.flight.arrivalCity}
Departure date: ${reservation.flight.departureDate}
Estimated arrival time: ${reservation.flight.estimatedDepartureTime}
</pre>
<h2>Passenger information: </h2>
<pre>
Firstname: ${reservation.passenger.firstname}
Lastname:  ${reservation.passenger.lastname}
Phone number: ${reservation.passenger.phone} 

</pre>
<form action="completeCheckIn" method="post">
<pre>
Number of bags: <input type="text" name="numberOfBags"/>
 <input type="hidden" name="reservationId" value="${reservation.id}"/>
 <input type="submit" name="" value="Check in"/>
</pre>
</form>
</body>
</html>