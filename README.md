# Music-Streaming-App
### 음악 스트리밍 안드로이드 앱

#### 음악 리스트를 보여주고 선택한 음악을 재생할 수 있는 음악 스트리밍 안드로이드 앱 입니다.
### Blog
* <https://hwayomingdlog.tistory.com/297>
* <https://hwayomingdlog.tistory.com/298>

</br>

## 주기능
### 재생목록 화면
* 재생목록을 RecyclerView로 표시합니다.
* 하단에 위치한 음악 컨트롤러를 통해 재생 중인 음악이 있다면 일시정지/재생 버튼을 눌러 플레이어를 컨트롤 할 수 있으며, 이전 곡이나 다음 곡으로 건너뛰기가 가능합니다.
* 재생 중인 음악을 표시합니다.
</br>

### 재생 화면
* 재생 중인 음악이 있는 경우, 재생목록 화면에서 왼쪽 하단 아이콘을 클릭하면 재생 화면으로 전환되며 해당 음악의 제목, 아티스트, 커버 이미지 정보를 볼 수 있습니다.
* SeekBar를 통해 현재 재생된 타임을 알 수 있으며, SeekBar를 터치해서 원하는 구간으로 건너뛰어 음악을 재생할 수 있습니다.
* 하단에 위치한 음악 컨트롤러를 통해 재생 중인 음악이 있다면 일시정지/재생 버튼을 눌러 플레이어를 컨트롤 할 수 있으며, 이전 곡이나 다음 곡으로 건너뛰기가 가능합니다.
* 재생 화면에서 왼쪽 하단 아이콘을 클릭해서 재생목록 화면으로 전환할 수 있습니다.
</br>

## 활용 기술
* Fragment - 재생목록 화면과 재생 화면을 구성한 레이아웃을 보여주는 Fragment를 사용해서 View 객체를 재사용하였습니다.
* Group - 재생 화면과 재생목록 화면을 하나의 Layout 파일로 작성하고 두 ViewGroup을 번갈아가며 Visible 값을 적용함으로써 화면전환 효과를 주기 위해 ConstraintLayout의 위젯 중 하나인 Group을 사용했습니다.
* ExoPlayer2 - 음악을 재생하기 위해 미디어 플레이어를 제공하는 ExoPlayer2 라이브러리를 사용했습니다. </br>
플레이어의 상태가 변화함에 따라 호출되는 다양한 콜백 함수를 활용해서 플레이 구간을 변경하거나, 미디어 아이템이 변경될 때 등 다양한 상황에 맞추어 플레이어를 동작시키고 UI를 갱신하였습니다.
* Retrofit2 - 재생목록을 구성하는 Mocking 데이터를 가져오기 위해 Retrofit2 라이브러리를 사용했습니다. </br>
Retrofit Service를 구현하기 위해 Entity, Model, DTO, Service 클래스를 정의하였습니다.
* SeekBar - 재생 화면에서 SeekBar를 이용해 사용자가 원하는 재생 구간에서 음악을 재생되도록 SeekBar에 클릭 이벤트가 발생하면 플레이어의 seek을 변경하도록 구현하였습니다.
</br>

***
<img src="/img/img0.png" width="300px" height="600px" title="" alt=""></img>
<img src="/img/img1.png" width="300px" height="600px" title="" alt=""></img>
<img src="/img/img2.png" width="300px" height="600px" title="" alt=""></img>
