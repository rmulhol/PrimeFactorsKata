class PrimeFactors
  def prime_factors(num)
    factors, divisor = [], 1
    while num > 1 and divisor += 1
      factors << divisor and num /= divisor while num % divisor == 0
    end
    factors
  end
end
