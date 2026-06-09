// Package weather provides weather details.
package weather

var (
	// CurrentCondition is the current weather conditions at
	// CurrentLocation.
	CurrentCondition string
	// CurrentLocation is the location where we are determining
	// the weather.
	CurrentLocation string
)

// Forecast returns a string describing the current weather conditions
// and takes two string parameters: city (the location for the
// forecast) and condition (the current weather conditions).
func Forecast(city, condition string) string {
	CurrentLocation, CurrentCondition = city, condition
	return CurrentLocation + " - current weather condition: " + CurrentCondition
}
