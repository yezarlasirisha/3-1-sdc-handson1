package project.handson1.model

data class ChatRequest(
    val contents: List<Content>
) {
    constructor(prompt: String) : this(
        contents = listOf(Content(parts = listOf(Part(text = prompt))))
    )
}

data class Content(
    val parts: List<Part>
)

data class Part(
    val text: String
)