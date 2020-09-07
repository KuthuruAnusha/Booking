package com.cg;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.stream.Collectors;
import java.util.stream.Stream;


import org.springframework.boot.test.mock.mockito.MockBean;

import com.cg.fms.dao.AirportDao;
import com.cg.fms.dao.BookingDao;
import com.cg.fms.dao.PassengerDao;
import com.cg.fms.entity.Airport;
import com.cg.fms.entity.Booking;
import com.cg.fms.exception.AirportException;
import com.cg.fms.exception.BookingException;
import com.cg.fms.service.BookingService;



@SpringBootTest
class FmSspringApplicationTests {
@MockBean
private BookingDao bookingdao;

@MockBean
private AirportDao airportDao;


@Autowired
private BookingService bookingservice;

@Test
public void getAirportsTest()  throws AirportException{
when(airportDao.findAll()).thenReturn(Stream.of(new Airport(" HYD", " Rajiv Gandhi International Airport "," Hyderabad"),new Airport(" HYD", " Rajiv Gandhi International Airport "," Hyderabad")).collect(Collectors.toList()));
assertEquals(2,bookingservice.findAllAP().size());
}

}

