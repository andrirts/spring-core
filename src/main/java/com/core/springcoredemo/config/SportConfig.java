package com.core.springcoredemo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.core.springcoredemo.common.Coach;
import com.core.springcoredemo.common.SwimCoach;

@Configuration
public class SportConfig {
  
  @Bean
  public Coach swimCoach() {
    return new SwimCoach();
  }

}
