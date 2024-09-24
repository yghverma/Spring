package com.pack.annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

@Configuration
public class ExampleConfiguration {

		@Bean
		public Example1 example1() {
			return new Example1();
		}
		
		@Bean
		@Scope("prototype") //for different object
		public Example2 example2() {
			return new Example2();
		}
		
		@Bean
		public Example3 example3() {
			return new Example3();
		}
		
		@Bean
		public Example3 example4() {
			return new Example3("hello example4");
		}
		
		@Bean
		@Primary // If same bean is configured  multiple times then which one to use
		public Example3 example5() {
			return new Example3("hello example5");
		}
}
