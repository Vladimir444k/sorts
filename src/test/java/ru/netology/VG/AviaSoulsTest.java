package ru.netology.VG;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.*;

class AviaSoulsTest {
    @Test
    public void shouldTicketTest() {
        AviaSouls aviaSouls = new AviaSouls();
        Ticket ticket1 = new Ticket("MSK", "SPB", 150, 13, 11);
        Ticket ticket2 = new Ticket("MSK", "LA", 550, 11, 9);
        Ticket ticket3 = new Ticket("MSK", "SPB", 250, 10, 6);
        Ticket ticket4 = new Ticket("MSK", "SPB", 225, 13, 10);
        Ticket ticket5 = new Ticket("NEW", "SPB", 155, 15, 8);
        Ticket ticket6 = new Ticket("MSK", "SPB", 120, 9, 5);
        Ticket ticket7 = new Ticket("MSK", "SPB", 140, 14, 7);
        aviaSouls.add(ticket1);
        aviaSouls.add(ticket2);
        aviaSouls.add(ticket3);
        aviaSouls.add(ticket4);
        aviaSouls.add(ticket5);
        aviaSouls.add(ticket6);
        aviaSouls.add(ticket7);

        Ticket[] expected = {ticket6, ticket7, ticket1, ticket4, ticket3};
        Ticket[] actual = aviaSouls.search("MSK", "SPB");

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldTicketTestNotTickets() {
        AviaSouls aviaSouls = new AviaSouls();
        Ticket ticket1 = new Ticket("MSK", "SPB", 150, 13, 11);
        Ticket ticket2 = new Ticket("MSK", "LA", 550, 11, 9);
        Ticket ticket3 = new Ticket("MSK", "SPB", 250, 10, 6);
        Ticket ticket4 = new Ticket("MSK", "SPB", 225, 13, 10);
        Ticket ticket5 = new Ticket("NEW", "SPB", 155, 15, 8);
        Ticket ticket6 = new Ticket("MSK", "SPB", 120, 9, 5);
        Ticket ticket7 = new Ticket("MSK", "SPB", 140, 14, 7);
        aviaSouls.add(ticket1);
        aviaSouls.add(ticket2);
        aviaSouls.add(ticket3);
        aviaSouls.add(ticket4);
        aviaSouls.add(ticket5);
        aviaSouls.add(ticket6);
        aviaSouls.add(ticket7);

        Ticket[] expected = {};
        Ticket[] actual = aviaSouls.search("MSK", "NY");

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldTicketTestOneTicket() {
        AviaSouls aviaSouls = new AviaSouls();
        Ticket ticket1 = new Ticket("MSK", "SPB", 150, 13, 11);
        Ticket ticket2 = new Ticket("MSK", "LA", 550, 11, 9);
        Ticket ticket3 = new Ticket("MSK", "SPB", 250, 10, 6);
        Ticket ticket4 = new Ticket("MSK", "SPB", 225, 13, 10);
        Ticket ticket5 = new Ticket("NEW", "SPB", 155, 15, 8);
        Ticket ticket6 = new Ticket("MSK", "SPB", 120, 9, 5);
        Ticket ticket7 = new Ticket("MSK", "SPB", 140, 14, 7);
        aviaSouls.add(ticket1);
        aviaSouls.add(ticket2);
        aviaSouls.add(ticket3);
        aviaSouls.add(ticket4);
        aviaSouls.add(ticket5);
        aviaSouls.add(ticket6);
        aviaSouls.add(ticket7);

        Ticket[] expected = {ticket2};
        Ticket[] actual = aviaSouls.search("MSK", "LA");

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldTicketComparatorTest() {
        AviaSouls aviaSouls = new AviaSouls();
        Ticket ticket1 = new Ticket("MSK", "SPB", 150, 10, 12);
        Ticket ticket2 = new Ticket("MSK", "LA", 550, 11, 15);
        Ticket ticket3 = new Ticket("MSK", "SPB", 250, 11, 14);
        Ticket ticket4 = new Ticket("MSK", "SPB", 225, 7, 17);
        Ticket ticket5 = new Ticket("NEW", "SPB", 155, 15, 8);
        Ticket ticket6 = new Ticket("MSK", "SPB", 120, 6, 10);
        Ticket ticket7 = new Ticket("MSK", "SPB", 140, 7, 8);
        aviaSouls.add(ticket1);
        aviaSouls.add(ticket2);
        aviaSouls.add(ticket3);
        aviaSouls.add(ticket4);
        aviaSouls.add(ticket5);
        aviaSouls.add(ticket6);
        aviaSouls.add(ticket7);
        Comparator<Ticket> comparator = new TicketTimeComparator();

        Ticket[] expected = {ticket7, ticket1, ticket3, ticket6, ticket4};
        Ticket[] actual = aviaSouls.search("MSK", "SPB", comparator);

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldTicketComparatorTestNotTickets() {
        AviaSouls aviaSouls = new AviaSouls();
        Ticket ticket1 = new Ticket("MSK", "SPB", 150, 10, 12);
        Ticket ticket2 = new Ticket("MSK", "LA", 550, 11, 15);
        Ticket ticket3 = new Ticket("MSK", "SPB", 250, 11, 14);
        Ticket ticket4 = new Ticket("MSK", "SPB", 225, 7, 17);
        Ticket ticket5 = new Ticket("NEW", "SPB", 155, 15, 8);
        Ticket ticket6 = new Ticket("MSK", "SPB", 120, 6, 10);
        Ticket ticket7 = new Ticket("MSK", "SPB", 140, 7, 8);
        aviaSouls.add(ticket1);
        aviaSouls.add(ticket2);
        aviaSouls.add(ticket3);
        aviaSouls.add(ticket4);
        aviaSouls.add(ticket5);
        aviaSouls.add(ticket6);
        aviaSouls.add(ticket7);
        Comparator<Ticket> comparator = new TicketTimeComparator();

        Ticket[] expected = {};
        Ticket[] actual = aviaSouls.search("MSK", "RND", comparator);

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldTicketComparatorTestOneTicket() {
        AviaSouls aviaSouls = new AviaSouls();
        Ticket ticket1 = new Ticket("MSK", "SPB", 150, 10, 12);
        Ticket ticket2 = new Ticket("MSK", "LA", 550, 11, 15);
        Ticket ticket3 = new Ticket("MSK", "SPB", 250, 11, 14);
        Ticket ticket4 = new Ticket("MSK", "SPB", 225, 7, 17);
        Ticket ticket5 = new Ticket("NEW", "SPB", 155, 15, 8);
        Ticket ticket6 = new Ticket("MSK", "SPB", 120, 6, 10);
        Ticket ticket7 = new Ticket("MSK", "SPB", 140, 7, 8);
        aviaSouls.add(ticket1);
        aviaSouls.add(ticket2);
        aviaSouls.add(ticket3);
        aviaSouls.add(ticket4);
        aviaSouls.add(ticket5);
        aviaSouls.add(ticket6);
        aviaSouls.add(ticket7);
        Comparator<Ticket> comparator = new TicketTimeComparator();

        Ticket[] expected = {ticket5};
        Ticket[] actual = aviaSouls.search("NEW", "SPB", comparator);

        Assertions.assertArrayEquals(expected, actual);
    }
}