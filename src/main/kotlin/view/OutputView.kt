package view

const val EMPTY_VALUE_ERROR_MESSAGE = "값이 비어있습니다."
const val INVALID_NUMBER_FORMAT_MESSAGE = "입력한 값은 숫자여야 합니다."
const val NOT_ENOUGH_MONEY_MESSAGE = "금액이 부족합니다"
const val INVALID_LOTTO_NUMBER_COUNT_MESSAGE = "로또 번호는 6개여야 합니다."

private const val INPUT_MONEY_MESSAGE = "구입금액을 입력해 주세요."
private const val INPUT_MANUAL_INPUT_MESSAGE = "수동으로 구매할 로또 수를 입력해 주세요."
private const val INPUT_LOTTO_NUMBER_MESSAGE = "로또 번호를 입력해 주세요. (공백으로 구분)"

class OutputView {
    fun requestCapital() {
        println(INPUT_MONEY_MESSAGE)
    }

    fun printMessage(message: String) {
        println(message)
    }

    fun requestManualCount() {
        println(INPUT_MANUAL_INPUT_MESSAGE)
    }

    fun requestManualLottoNumber() {
        println(INPUT_LOTTO_NUMBER_MESSAGE)
    }
}
