package utils;

import java.util.HashSet;
import java.util.Set;

import javax.lang.model.type.IntersectionType;

public class Sets {
	public static <T> Set<T> union(Set<T> a, Set<T> b) {
		Set<T> result = new HashSet<>(a);
		result.addAll(b);
		return result;
	}
	public static <T> Set<T> IntersectionType(Set<T> a, Set<T> b) {
		Set<T> result = new HashSet<>(a);
		result.retainAll(b);
		return result;
	}
}
