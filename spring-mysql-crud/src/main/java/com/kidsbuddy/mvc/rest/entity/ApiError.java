package com.kidsbuddy.mvc.rest.entity;

public class ApiError {
		private String message;
		private String code;
		/**
		 * @return the message
		 */
		public String getMessage() {
			return message;
		}
		/**
		 * @param message the message to set
		 */
		public void setMessage(String message) {
			this.message = message;
		}
		/**
		 * @return the code
		 */
		public String getCode() {
			return code;
		}
		/**
		 * @param code the code to set
		 */
		public void setCode(String code) {
			this.code = code;
		}
		public  ApiError(String message, String code) {
			super();
			this.message = message;
			this.code = code;
		}
		protected ApiError() {
			super();
		}
		
}
