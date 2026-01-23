package m1_tasks;

class CarSpeedImplementation{
	
	public String setCarSpeed(CarSpeed sp,int spd) {
		try {
		if(spd<30 ||spd>90)
			throw new SpeedInvalidException("Exception in speed validation");
		else
			sp.speed="Valid";
	}
		catch(SpeedInvalidException ex)
		{
			sp.speed=ex.getMessage();
		}
		return sp.speed;
	}		
}
