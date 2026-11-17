// create a function and implement it
const val DEFAULT_DISCOUNT = 0.0
fun calculateTotalMealCost(baseCost: Double,
                           taxRate: Double,
                           tipPercentage: Double,
                           discount: Double = DEFAULT_DISCOUNT) : Double {
    fun applyTax(cost: Double, taxRate: Double): Double {
        return cost * taxRate + cost
    }

    fun applyTip(cost: Double, tipPercentage: Double): Double {
        return cost * tipPercentage + cost
    }

    fun applyDiscount(cost: Double, discount: Double) = cost - discount

    return applyDiscount(applyTip(applyTax(baseCost, taxRate), tipPercentage), discount)
}
