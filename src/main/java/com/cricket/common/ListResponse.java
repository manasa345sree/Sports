package com.cricket.common;

import java.util.List;

public class ListResponse {
	private List data;
	private Status status;
	private int totalResult;
	

	public ListResponse() {
		//super();
		// TODO Auto-generated constructor stub
	}
	


	public ListResponse(List data, Status status) {
		super();
		this.data = data;
		this.status = status;
	}



	public List getData() {
		return data;
	}

	public void setData(List data) {
		this.data = data;
	}


	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}





	public int getTotalResult() {
		return totalResult;
	}


	public void setTotalResult(int totalResult) {
		this.totalResult = totalResult;
	}


	public static class Status{
		private String success;
		private String message;
		
		
		public Status() {
			super();
			// TODO Auto-generated constructor stub
		}


		public String getSuccess() {
			return success;
		}


		public void setSuccess(String success) {
			this.success = success;
		}


		public String getMessage() {
			return message;
		}


		public void setMessage(String message) {
			this.message = message;
		}
		
		
	}
}
