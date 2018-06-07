package io.github.whsc3.stickerprinter;
import spark.Request;
import spark.Response;
import spark.Route;

import static spark.Spark.*;

public class StickerPrinterApp {
	public static void main(String[] args) {
		post("purchase", StickerPrinterApp.purchase);
		get("print", StickerPrinterApp.print);
	}
	static final Route purchase = (Request req, Response res) -> {
		return "Purchasing still has to be implemented";
	};
	static final Route print = (Request req, Response res) -> {
		return "Printing still has to be implemented";
	};
}
