
import (
    "strings"
)

func solution(babbling []string) int {
    count := 0

    for _, word := range babbling {
        if isBabble(word) {
            count++
        }
    }
    return count
}

func isBabble(word string) bool {
    ayaCount := strings.Count(word, "aya")
    yeCount := strings.Count(word, "ye")
    wooCount := strings.Count(word, "woo")
    maCount := strings.Count(word, "ma")

    if ayaCount > 1 || yeCount > 1 || wooCount > 1 || maCount > 1 {
        return false
    }

    if ayaCount == 1 {
        word = strings.Replace(word, "aya", "", 1)
    }

    if yeCount == 1 {
        word = strings.Replace(word, "ye", "", 1)
    }

    if wooCount == 1 {
        word = strings.Replace(word, "woo", "", 1)
    }

    if maCount == 1 {
        word = strings.Replace(word, "ma", "", 1)
    }

    return len(word) == 0
}