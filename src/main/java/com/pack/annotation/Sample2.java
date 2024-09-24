package com.pack.annotation;

public class Sample2 {
	private Sample sample;
	public Sample getSample() {
		return sample;
	}
	public void setSample(Sample sample) {
		this.sample = sample;
	}
	public Sample2() {
		System.out.println("Sample 2 got started");
	}
}