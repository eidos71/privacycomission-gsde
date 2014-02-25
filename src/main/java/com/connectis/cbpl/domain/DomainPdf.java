package com.connectis.cbpl.domain;

public class DomainPdf {
	private String pdfUrl;
	private String status;
	
	public String getStatus() {
		return status;
	}

	public String getPdfUrl() {
		return pdfUrl;
	}

	public void setPdfUrl(String pdfUrl) {
		this.pdfUrl = pdfUrl;
	}

	public void setStatus(String string) {
		this.status=string;
		
	}

	@Override
	public String toString() {
		return "DomainPdf [pdfUrl=" + pdfUrl + ", status=" + status + "]";
	}
	
	

}
