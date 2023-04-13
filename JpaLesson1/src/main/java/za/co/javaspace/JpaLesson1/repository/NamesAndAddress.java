/*
 * Copyright 2023 , All Rights Reserved
 * Licensed under the Apache License, Version 2.0 (the "License");
 * Unauthorized copying of this file, via any medium is strictly prohibited.
 * Proprietary and confidential
 * @author  Mothusi Molorane
 * @since 1.0
 */

package za.co.javaspace.JpaLesson1.repository;

import org.springframework.beans.factory.annotation.Value;

import java.util.List;

public interface NamesAndAddress {
    String getFirstName();
    String getLastName();

    List<AddressView> getAddresses();

    interface AddressView {
        String getCity();
        String getStreetName();
    }
}