package br.com.brudev.controllers;

import java.util.concurrent.atomic.AtomicLong;

import br.com.brudev.service.MathService;
import org.springframework.web.bind.annotation.*;


@RestController
public class MathController {
	private final AtomicLong counter = new AtomicLong();
	private final MathService mathService;

	public MathController(MathService mathService) {
		this.mathService = mathService;
	}


	@GetMapping
	@RequestMapping(value = "/sum/{numberOne}/{numberTwo}")
	//,method = RequestMethod.GET)
	public Double sum(
			@PathVariable(value = "numberOne") String numberOne,
			@PathVariable(value = "numberTwo") String numberTwo
	) throws Exception{
		Double res = mathService.sum(numberOne, numberTwo);
		return res;
	}

	@GetMapping
	@RequestMapping(value = "/subtract/{numberOne}/{numberTwo}")
	public Double subtract(
			@PathVariable(value = "numberOne") String numberOne,
			@PathVariable(value = "numberTwo") String numberTwo
	) throws Exception{
		Double res = mathService.subtract(numberOne, numberTwo);
		return res;
	}

	@GetMapping
	@RequestMapping(value = "/multiply/{numberOne}/{numberTwo}")
	public Double multiply(
			@PathVariable(value = "numberOne") String numberOne,
			@PathVariable(value = "numberTwo") String numberTwo
	) throws Exception{
		Double res = mathService.multiply(numberOne, numberTwo);
		return res;
	}

	@GetMapping
	@RequestMapping(value = "/divide/{numberOne}/{numberTwo}")
	public Double divide(
			@PathVariable(value = "numberOne") String numberOne,
			@PathVariable(value = "numberTwo") String numberTwo
	) throws Exception{
		Double res = mathService.divide(numberOne, numberTwo);
		return res;
	}

	@GetMapping
	@RequestMapping(value = "/media/{numberOne}/{numberTwo}")
	public Double media(
			@PathVariable(value = "numberOne") String numberOne,
			@PathVariable(value = "numberTwo") String numberTwo
	) throws Exception{
		Double res = mathService.media(numberOne, numberTwo);
		return res;
	}

	@GetMapping
	@RequestMapping(value = "/squared/{number}")
	public Double squared(
			@PathVariable(value = "number") String number
	) throws Exception{
		Double res = mathService.squared(number);
		return res;
	}

	@GetMapping
	@RequestMapping(value = "/squareroot/{number}")
	public Double squareRoot(
			@PathVariable(value = "number") String number
	) throws Exception{
		Double res = mathService.squareRoot(number);
		return res;
	}
}
