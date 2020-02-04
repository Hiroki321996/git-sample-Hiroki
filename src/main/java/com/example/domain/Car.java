package com.example.domain;

public class Car {

	private String bodyColor;
	private Integer speed;

	@Override
	public String toString() {
		return "Car [bodyColor=" + bodyColor + ", speed=" + speed + "]";
	}

	public String getBodyColor() {
		return bodyColor;
	}

	public void setBodyColor(String bodyColor) {
		this.bodyColor = bodyColor;
	}

	public Integer getSpeed() {
		return speed;
	}

	public void setSpeed(Integer speed) {
		this.speed = speed;
	}
}
