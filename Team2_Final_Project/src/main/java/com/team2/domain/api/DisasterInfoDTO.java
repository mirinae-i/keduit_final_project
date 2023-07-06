package com.team2.domain.api;

import java.util.List;

public class DisasterInfoDTO {

	private Head head;
	private List<Row> row;

	public Head getHead() {
		return head;
	}

	public List<Row> getRow() {
		return row;
	}

	public void setHead(Head head) {
		this.head = head;
	}

	public void setRow(List<Row> row) {
		this.row = row;
	}

	@Override
	public String toString() {
		return "DisasterInfoDTO [head=" + head + ", row=" + row + "]";
	}

	public class Head {

		private String totalCount;
		private String numOfRows;
		private String pageNo;
		private String type;
		private RESULT RESULT;

		public String getTotalCount() {
			return totalCount;
		}

		public String getNumOfRows() {
			return numOfRows;
		}

		public String getPageNo() {
			return pageNo;
		}

		public String getType() {
			return type;
		}

		public RESULT getRESULT() {
			return RESULT;
		}

		public void setTotalCount(String totalCount) {
			this.totalCount = totalCount;
		}

		public void setNumOfRows(String numOfRows) {
			this.numOfRows = numOfRows;
		}

		public void setPageNo(String pageNo) {
			this.pageNo = pageNo;
		}

		public void setType(String type) {
			this.type = type;
		}

		public void setRESULT(RESULT result) {
			RESULT = result;
		}

		@Override
		public String toString() {
			return "Head [totalCount=" + totalCount + ", numOfRows=" + numOfRows + ", pageNo=" + pageNo + ", type="
					+ type + ", RESULT=" + RESULT + "]";
		}

		public class RESULT {

			private String resultCode;
			private String resultMsg;

			public String getResultCode() {
				return resultCode;
			}

			public String getResultMsg() {
				return resultMsg;
			}

			public void setResultCode(String resultCode) {
				this.resultCode = resultCode;
			}

			public void setResultMsg(String resultMsg) {
				this.resultMsg = resultMsg;
			}

			@Override
			public String toString() {
				return "RESULT [resultCode=" + resultCode + ", resultMsg=" + resultMsg + "]";
			}

		}

	}

	public class Row {

		private String create_date;
		private String location_id;
		private String location_name;
		private String md101_sn;
		private String msg;
		private String send_platform;

		public String getCreate_date() {
			return create_date;
		}

		public String getLocation_id() {
			return location_id;
		}

		public String getLocation_name() {
			return location_name;
		}

		public String getMd101_sn() {
			return md101_sn;
		}

		public String getMsg() {
			return msg;
		}

		public String getSend_platform() {
			return send_platform;
		}

		public void setCreate_date(String create_date) {
			this.create_date = create_date;
		}

		public void setLocation_id(String location_id) {
			this.location_id = location_id;
		}

		public void setLocation_name(String location_name) {
			this.location_name = location_name;
		}

		public void setMd101_sn(String md101_sn) {
			this.md101_sn = md101_sn;
		}

		public void setMsg(String msg) {
			this.msg = msg;
		}

		public void setSend_platform(String send_platform) {
			this.send_platform = send_platform;
		}

		@Override
		public String toString() {
			return "Row [create_date=" + create_date + ", location_id=" + location_id + ", location_name="
					+ location_name + ", md101_sn=" + md101_sn + ", msg=" + msg + ", send_platform=" + send_platform
					+ "]";
		}

	}

}
