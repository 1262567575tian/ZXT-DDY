public BaseResponse<Map<String, Object>> selecteH5PageRate(@RequestBody JSONObject object){
		logger.info("selecteH5PageRate param:{}",object);
		Map<String, Object> returnMap=new HashMap<>();
		ExchangeInfoResponse fuminRate=new ExchangeInfoResponse();
		JSONObject bizContent = object.getJSONObject("bizContent");
		String jsonStr = JSONObject.toJSONString(bizContent);
		ExchangeInfoRequest request = JSONObject.parseObject(jsonStr, ExchangeInfoRequest.class);
		request.setMonyEnter(CalculationUtil.multip(bizContent.getString("enter"), "1000000").toString());
		Calendar calendar = Calendar.getInstance();
	    calendar.add(Calendar.YEAR,1);
	    calendar.add(Calendar.DAY_OF_YEAR,-1);
	    calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
		
£ý