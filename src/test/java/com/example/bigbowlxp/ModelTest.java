package com.example.bigbowlxp;

import com.example.bigbowlxp.models.AirHockeyTable;
import com.example.bigbowlxp.models.BowlingLane;
import com.example.bigbowlxp.models.Customer;
import com.example.bigbowlxp.models.Menu;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
public class ModelTest {


    @Test
    void bowlingModelTest(){
        BowlingLane lane = new BowlingLane();
        lane.setId(1);
        lane.setChildLane(false);
        lane.setStatus(true);
        lane.description("all ok!");

        assertThat(lane.getId() == 1);
        assertThat(lane.isChildLane() == false);
        assertThat(lane.getStatus() == true);
        assertThat(lane.getDescription().equals("all ok!"));

        lane.setId(2);
        lane.setChildLane(true);
        lane.setStatus(false);
        lane.description("it's ruined!");

        assertThat(lane.getId() == 2);
        assertThat(lane.isChildLane() == true);
        assertThat(lane.getStatus() == false);
        assertThat(lane.getDescription().equals("it's ruined!"));


    }

    @Test
    void airHockeyModelTest(){
        AirHockeyTable airHockeyTable = new AirHockeyTable();

        airHockeyTable.setId(1);
        airHockeyTable.setStatus(true);
        airHockeyTable.setDescription("desc");

        assertThat(airHockeyTable.getId() == 1);
        assertThat(airHockeyTable.getStatus() == true);
        assertThat(airHockeyTable.getDescription().equals("desc"));

    }

    @Test
    void customerModelTest(){
        Customer customer = new Customer();
        customer.setId(1);
        customer.setName("Patrick Biiiiiiiiiiiiil");
        customer.setApartment("14");
        customer.setCity("Tórshavn");
        customer.setZipCode("100");
        customer.setStreet("Sverrisgøta");
        customer.setPhoneNumber("00298421634");
        customer.setStreetNumber("5b");

        assertThat(customer.getId() == 1);
        assertThat(customer.getName().equals("Patrick Biiiiiiiiiiiiil"));
        assertThat(customer.getApartment().equals("14"));
        assertThat(customer.getCity().equals("Tórshavn"));
        assertThat(customer.getZipCode().equals("100"));
        assertThat(customer.getStreet().equals("Sverrisgøta"));
        assertThat(customer.getPhoneNumber().equals("00298421634"));
        assertThat(customer.getStreetNumber().equals("5b"));
    }

    @Test
    void menuModelTest(){
        Menu menu = new Menu();
        menu.setFood_id(1);
        menu.setName("ost");
        menu.setPrice(1234.5);

        assertThat(menu.getFood_id() == 1);
        assertThat(menu.getName().equals("ost"));
        assertThat(menu.getPrice() == 1234.5);
    }

}
