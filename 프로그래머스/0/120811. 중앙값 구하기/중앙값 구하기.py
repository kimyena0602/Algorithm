def solution(array):
    # 1. 배열을 정렬합니다.
    sorted_array = sorted(array)
    
    # 2. 중간 인덱스를 찾습니다.
    mid = len(sorted_array) // 2
    
    # 3. 중간 인덱스에 해당하는 값이 중앙값입니다.
    return sorted_array[mid]
