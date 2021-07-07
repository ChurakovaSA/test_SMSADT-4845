require: slotfilling/slotFilling.sc
  module = sys.zb-common
  
theme: /

    state: Start
        q!: $regex</start>
        a: Начнём.

    state: Приветствие
        intent!: /привет
        a: Привет привет

    state: Прощание
        intent!: /пока
        a: Пока пока
        
    state: имена
        q!: @nams
        a: Привет,  {{JSON.stringify($parseTree)}}
        
    state: встр
        q!: @duckling.time
        a: {{JSON.stringify($parseTree)}}

    state: Fallback
        event!: noMatch
        a: Я не понял. Вы сказали: {{$request.query}}

