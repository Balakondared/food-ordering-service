/******************************************************************************
 * Copyright (C) 1998-2018 Application Development, Innominds Software Pvt Ltd.
 *
 * This file is part of MySpaceNX Project
 *
 * MySpaceNX Project and associated code cannot be copied and/or distributed
 * without a written permission of Innominds Software Pvt Ltd., and/or it
 * subsidiaries
 *
 *****************************************************************************/
package com.mphasis;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableOAuth2Client;

@SpringBootApplication
public class FoodOrderingServiceApplication implements CommandLineRunner {
    /** Reference to the logger */
    private static final Logger LOGGER = LoggerFactory.getLogger(FoodOrderingServiceApplication.class);

    /**
     * Entry point method.
     *
     * @param args
     *         Arguments to the program.
     */
    public static void main(final String[] args) {
        new SpringApplication(FoodOrderingServiceApplication.class).run(args);
    }
}