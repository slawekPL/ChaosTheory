package pl.chaos.theory.algorithm.impl;

import pl.chaos.theory.algorithm.Algorithm;
import pl.chaos.theory.algorithm.AlgorithmInfo;
import pl.chaos.theory.algorithm.AlgorithmType;
import pl.chaos.theory.algorithm.ParameterInfo;
import pl.chaos.theory.algorithm.validation.RangeValidator;
import pl.chaos.theory.dto.model.ImageDto;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

//TODO : implemnt it
public class ChaosNumberGenerator implements Algorithm {
	private final static AlgorithmType algorithmType = AlgorithmType.CHAOS_NUMBER_GENERATOR;

	@Override
	public ImageDto calculate(Map<String, Double> parameters) {
		return new ImageDto();
	}

	@Override
	public List<ParameterInfo> parameters() {
		ArrayList<ParameterInfo> parameterInfos = new ArrayList<ParameterInfo>();
		parameterInfos.add(new ParameterInfo(new RangeValidator(3, 10), "x", "jol"));
		parameterInfos.add(new ParameterInfo(new RangeValidator(10, 100), "z", "jol"));
		return parameterInfos;
	}

	@Override
	public AlgorithmInfo getAlgorithmInfo() {
		return new AlgorithmInfo(algorithmType.name(), "deeees", algorithmType);
	}

	@Override
	public AlgorithmType getAlgorithmType() {
		return algorithmType;
	}

}
