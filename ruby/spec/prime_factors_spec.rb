require 'prime_factors'

describe PrimeFactors do
  let(:test) { described_class.new }

  [
    [1, []],
    [2, [2]],
    [3, [3]],
    [4, [2, 2]],
    [5, [5]],
    [6, [2, 3]],
    [7, [7]],
    [8, [2, 2, 2]],
    [9, [3, 3]],
    [10, [2, 5]]
  ].each do |num, factors|
    it "factors #{num}" do
      expect(test.prime_factors(num)).to eq(factors)
    end
  end
end
