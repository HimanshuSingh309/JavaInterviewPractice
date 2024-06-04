package practice;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CalenderHandling {

	static WebDriver driver;
	static int splitedYear;
	static String splitedMonth;

	public static void main(String[] args) {
		// Create ChromeOptions object to handle preferences
		ChromeOptions options = new ChromeOptions();

		// Disable notifications
		options.addArguments("--disable-notifications");

		driver = new ChromeDriver(options);
		driver.get("https://www.redbus.in/");
		driver.findElement(By.id("onwardCal")).click();
		String MonthYear = "Dec 2024";
		String[] part = MonthYear.split(" ");
		splitedMonth = part[0];
		String yearStr = part[1];
		splitedYear = Integer.parseInt(yearStr);
		selectFutureDate(29, MonthYear);
		System.out.println("Date Clicked.");

	}

	public static void selectFutureDate(int day, String expMonthYear) {
		List<String> monthsWith30Days = getMonthsWith30Days();
		if (monthsWith30Days.contains(splitedMonth)) {
			if (checkDayForMonths(monthsWith30Days, day)) {
				return;
			}
		}

		if (expMonthYear.contains(splitedMonth)) {
			if (splitedMonth.equals("Feb")) {
				if (isLeapYear(splitedYear) && day > 29) {
					System.out.println("You are passing the wrong date for Feb month. It's a leap year...");
					return;
				} else if (!isLeapYear(splitedYear) && day > 28) {
					System.out.println("You are passing the wrong date for Feb month. It's not a leap year...");
					return;
				}
			}
		}

		if (day > 31 || day <= 0) {
			System.out.println("You are passing the wrong date...");
			return;
		}
		String actMonthYear = driver
				.findElement(By.xpath("(//div[@class='DayNavigator__IconBlock-qj8jdz-2 iZpveD'])[2]")).getText();
		while (!actMonthYear.contains(expMonthYear)) {
			System.out.println(actMonthYear);
			driver.findElement(By.xpath("(//div[@class='DayNavigator__IconBlock-qj8jdz-2 iZpveD'])[3]")).click();
			actMonthYear = driver.findElement(By.xpath("(//div[@class='DayNavigator__IconBlock-qj8jdz-2 iZpveD'])[2]"))
					.getText();

		}
		System.out.println(actMonthYear);
		List<String> WeekendDates = getWeekendDates();
		System.out.println(WeekendDates);
		driver.findElement(By
				.xpath("//div[@class='DayTilesWrapper__RowWrap-sc-19pz9i8-1 fGGTDM']/span//span[text()='" + day + "']"))
				.click();

		return;

	}

	public static List<String> getWeekendDates() {
		List<WebElement> weekendDatesElements = driver
				.findElements(By.xpath("//span[@class='DayTiles__CalendarDaysSpan-sc-1xum02u-1 bwoYtA']"));

		List<String> weekendDates = new ArrayList<>();

		for (WebElement dateElement : weekendDatesElements) {
			String DatesText = dateElement.getText();
			weekendDates.add(DatesText);
		}
		return weekendDates;

	}

	public static List<String> getMonthsWith30Days() {
		List<String> monthsWith30Days = new ArrayList<>();
		monthsWith30Days.add("Apr");
		monthsWith30Days.add("Jun");
		monthsWith30Days.add("Sep");
		monthsWith30Days.add("Nov");
		return monthsWith30Days;
	}

	public static boolean checkDayForMonths(List<String> monthsWith30Days, int day) {
		for (String month : monthsWith30Days) {
			if (day > 30) {
				System.out.println("Please pass the right date for month " + month);
				return true;
			}
		}
		return false;
	}

	public static boolean isLeapYear(int year) {
		// Check if the year is a leap year
		return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
	}
}
