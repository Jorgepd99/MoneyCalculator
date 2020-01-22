package Control;

import Model.Currency;
import Model.ExchangeRate;

public interface ExchangeRateLoader {
    ExchangeRate load(Currency currency);
}