package project;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class MovieScore {
	// movieList클래스 ArrayList로 변수 선언
	private static ArrayList<Movie> movieList = new ArrayList<Movie>();
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		// 환영 문구
		System.out.println("                         !!!WELCOME!!!                       ");
		boolean run = true;
		// 반복문
		while (run) {
			System.out.println(" ----------------------------------------------------------- ");
			System.out.println("| 1.도서조회 | 2.도서추가 | 3.도서삭제 | 4.평점입력 | 5.리뷰입력 | 6. 끝  |");
			System.out.println("|-----------------------------------------------------------|");
			System.out.println("|********************** 번호를 입력해주세요 **********************|");
			System.out.print("                             ");
			// 번호 입력. 입력은 숫자로만 가능하다.
			int selectNum = Integer.parseInt(scanner.nextLine());
			switch (selectNum) {
			case 1:
				searchMovie();
				break;
			case 2:
				addMovie();
				break;
			case 3:
				deleteMovie();
				break;
			case 4:
				reviewNum();
				break;
			case 5:
				review();
				break;
			// 종료
			case 6:
				run = false;
				System.out.println("|************************* 다음에또봐요!! **************************|");
				break;
			// 재입력
			default:
				System.out.println("|********************** 잘못 입력하셨습니다. *********************|");
				System.out.println("|*********************** 다시 입력해주세요. *********************|");
				break;
			}

		}
	} // end main()

	// 1. 도서 조회
	private static void searchMovie() {
		System.out.print("| 도서 제목 (전제 조회를 원하시면 Enter키를 누르세요) : ");
		String movie = scanner.nextLine();
		boolean noneResult = false;
		for (int i = 0; i < movieList.size(); i++) {
			Movie m = movieList.get(i);
			if (m.getTitle().equals(movie)) {
				noneResult = true;
				System.out.println("| 제목 : " + m.getTitle() + " | 저자 : " + m.getProducer() + " | 출간일 : "
						+ m.getOpenning() + " | 장르 : " + m.getGenre() + " | 총점 : " + m.totalScore(m.getTotal()) + " |");
				System.out.println("| 리뷰 : " + m.getReview());
				break;
			}
		}
		// 전체 조회
		if (movie.matches("")) {
			System.out.println("|***************** 도서 리스트 ******************|");
			sortDisplay(movieList);
			noneResult = true;
			for (int i = 0; i < movieList.size(); i++) {
				 Movie m = movieList.get(i);
				System.out.printf("| %d. 제목 : %s , 저자 : %s \n", i + 1, movieList.get(i).getTitle(),
						movieList.get(i).getProducer());
			}
//			int i =0;
//			for(Movie m : movieList) {
//				System.out.printf("| %d. 제목 : %s , 저자 : %s \n", ++i, m.getMovie(),
//						m.getProducer());
//			}
		}
		// 등록되지 않은 도서 구문
		if (!noneResult) {
			System.out.println("|****************** 아직 등록되지 않은 도서입니다. ******************|");
			System.out.println("|********************** 다시 검색해 주세요. *********************|");
		}
	} // end serachMovie()

	// 도서 제목 오름차순 정렬
	public static void sortDisplay(ArrayList<Movie> mList) {
		mList.sort(new Movie());
			for (Movie m : mList)
				m.getTitle();
	}


	// 2. 도서 추가
	private static void addMovie() {
		System.out.print("|도서 제목 : ");
		String title = scanner.nextLine();
		System.out.print("|저자 : ");
		String producer = scanner.nextLine();
		System.out.print("|출간일 : ");
		String openning = scanner.nextLine();
		System.out.print("|장르 : ");
		String genre = scanner.next();
		scanner.nextLine();
		Movie m = new Movie();
		m.setTitle(title);
		m.setOpenning(openning);
		m.setGenre(genre);
		m.setProducer(producer);
		movieList.add(m);
		System.out.println("|********************* 도서가 추가되었습니다. *********************|");
	} // end addMovie()

	// 3. 도서 삭제
	private static void deleteMovie() {
		System.out.print("|도서 제목 : ");
		String movie = scanner.nextLine();
		boolean noneResult = false;
		for (int i = 0; i < movieList.size(); i++) {
			Movie m = movieList.get(i);
			if (m.getTitle().equals(movie)) {
				noneResult = true;
				movieList.remove(i);
				System.out.println("|********************* 도서가 삭제되었습니다. *********************|");
				break;
			}
		}
		if (!noneResult) {
			System.out.println("|********************** 검색결과가 없습니다. *********************|");
		}
	}

	// 4. 평점 입력
	private static void reviewNum() {
		System.out.println("|************* 평점은 최소 0.0점부터 최대 10.0점입니다. **************|");
		System.out.print("|도서 제목 : ");
		String movie = scanner.nextLine();
		boolean noneResult = false;
		for (int i = 0; i < movieList.size(); i++) {
			Movie m = movieList.get(i);
			if (m.getTitle().equals(movie)) {
				noneResult = true;
				System.out.print("|메타크리틱 : ");
				double metacritic = scanner.nextDouble();
				System.out.print("|로튼토마토 : ");
				double rottentomato = scanner.nextDouble();
				System.out.print("|네이버 : ");
				double naver = scanner.nextDouble();
				System.out.print("|다음 : ");
				double daum = scanner.nextDouble();
				scanner.nextLine();
				m.setMetacritic(metacritic);
				m.setRottentomato(rottentomato);
				m.setNaver(naver);
				m.setDaum(daum);
				break;
			}
		}
		if (!noneResult) {
			System.out.println("|********************** 검색결과가 없습니다. *********************|");
		}
	}

	// 5. 리뷰 입력
	private static void review() {
		System.out.print("|도서 제목 : ");
		String movie = scanner.nextLine();
		boolean noneResult = false;
		for (int i = 0; i < movieList.size(); i++) {
			Movie m = movieList.get(i);
			if (m.getTitle().equals(movie)) {
				noneResult = true;
				System.out.print("|리뷰 : ");
				String review = scanner.nextLine();
				// scanner.nextLine();
				m.setReview(review);
				break;
			}
		}
		if (!noneResult) {
			System.out.println("|********************** 검색결과가 없습니다. *********************|");
		}
	}

} // end class
