package homework.set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.LinkedHashSet;
import java.util.Objects;

public class UniqueWordVocabulary {

    Logger log = LoggerFactory.getLogger("Set ");

    LinkedHashSet<String> linkedHashSetSet = new LinkedHashSet<>();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UniqueWordVocabulary that = (UniqueWordVocabulary) o;
        return Objects.equals(linkedHashSetSet, that.linkedHashSetSet);
    }

    @Override
    public int hashCode() {
        return Objects.hash(linkedHashSetSet);
    }

    @Override
    public String toString() {
        return "UniqueWordVocabulary{" +
                "Set=" + linkedHashSetSet +
                '}';
    }

    public void addWord(String word) {
        if (!word.equals("")) {
            linkedHashSetSet.add(word);
        }
    }

    public int getWordsCount() {
        return linkedHashSetSet.size();
    }

    public void printVocabulary() {
        for (String set : linkedHashSetSet
        ) {
            log.info("hashSet {}", set);

        }
    }

}
