package com.springcore.standalone.collections;

import java.util.*;
public class Guests
{
private List<String> guests;

public List<String> getGuests() {
    return guests;
}

public void setGuests(List<String> guests) {
    this.guests = guests;
}

@Override
public String toString() {
    return "Guests{" +
            "guests=" + guests +
            '}';
}
}